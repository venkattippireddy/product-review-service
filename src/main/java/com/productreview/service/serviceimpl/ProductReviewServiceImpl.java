package com.productreview.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productreview.dao.entity.ProductReview;
import com.productreview.dao.repositorys.ProductReviewRepository;
import com.productreview.service.ProductReviewService;

@Service
public class ProductReviewServiceImpl implements ProductReviewService {

	@Autowired
	private ProductReviewRepository productReviewRepository;

	@Override
	public ProductReview saveProductReviews(ProductReview review, Long productId) {
		review.setProductId(productId);
		return productReviewRepository.save(review);
	}

	@Override
	public List<ProductReview> getProductReviews(Long id) {
		return productReviewRepository.findByProductId(id);
	}

	@Override
	public boolean deleteProductReview(Long prodId, Long reviewId) {

		boolean isDeleted = false;
		ProductReview review = productReviewRepository.findByIdAndProductId(reviewId,prodId);
		if (review != null) {
			productReviewRepository.delete(review);
			isDeleted = true;
		}
		return isDeleted;
	}

	
	@Override
	public ProductReview updateProductReview(ProductReview review, Long reviewId, Long productId) {

		ProductReview updateReview = productReviewRepository.findByIdAndProductId(reviewId, productId);
		if (updateReview != null) {
			updateReview.setRating(review.getRating());
			updateReview.setRemarks(review.getRemarks());
			productReviewRepository.save(updateReview);
		}
		return updateReview;
	}

}
