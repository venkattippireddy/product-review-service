package com.productreview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.productreview.dao.entity.ProductReview;
import com.productreview.service.ProductReviewService;

@RestController
public class ProductReviewController {

	@Autowired
	private ProductReviewService productReviewService;

	@GetMapping("/products/{productId}/reviews")
	public ResponseEntity<List<ProductReview>> getProductReviews(@RequestHeader(value = "SharedSecret") String secret,
			@PathVariable Long productId) {
		return ResponseEntity.ok(productReviewService.getProductReviews(productId));
	}

	@PostMapping("/products/{productId}/reviews")
	public ResponseEntity<ProductReview> saveProductReviews(@RequestHeader(value = "API-KEY") String secret,
			@RequestBody ProductReview review, @PathVariable Long productId) {

		return ResponseEntity.ok(productReviewService.saveProductReviews(review, productId));
	}
	@PutMapping("/products/{productId}/reviews/{reviewId}")
	public ResponseEntity<ProductReview> updateProductReviews(@RequestBody ProductReview review,
			@PathVariable Long reviewId, @PathVariable Long productId) {
		ProductReview updateReview = productReviewService.updateProductReview(review, reviewId, productId);
		return ResponseEntity.ok(updateReview);
	}

	@DeleteMapping("/products/{productId}/reviews/{reviewId}")
	public ResponseEntity<Boolean> deleteProductReviews(@PathVariable Long productId, @PathVariable Long reviewId) {
		return ResponseEntity.ok(productReviewService.deleteProductReview(productId, reviewId));
	}

}
