package com.productreview.dao.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productreview.dao.entity.ProductReview;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview, Long> {

	List<ProductReview> findByProductId(Long prodId);

	ProductReview findByIdAndProductId(Long reviewId, Long prodId);

	ProductReview deleteByIdAndProductId(Long reviewId, Long prodId);

}
