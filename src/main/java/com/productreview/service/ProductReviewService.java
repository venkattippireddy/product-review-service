package com.productreview.service;

import java.util.List;

import com.productreview.dao.entity.ProductReview;

public interface ProductReviewService {

	public ProductReview saveProductReviews(ProductReview review, Long productId);

	public ProductReview updateProductReview(ProductReview review, Long reviewId, Long productId);

	public List<ProductReview> getProductReviews(Long id);

	public boolean deleteProductReview(Long prodId, Long reviewId);

}
