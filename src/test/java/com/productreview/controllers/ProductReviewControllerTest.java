package com.productreview.controllers;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.productreview.controller.ProductReviewController;
import com.productreview.dao.entity.ProductReview;
import com.productreview.service.ProductReviewService;


@RunWith(SpringRunner.class)
@WebMvcTest(ProductReviewController.class)
public class ProductReviewControllerTest {

	@Autowired
	private MockMvc mockmvc;

	@MockBean
	private ProductReviewService productService;

	static ProductReview mockProd1 = new ProductReview();
	static ProductReview mockProd2 = new ProductReview();
	static ProductReview mockProd3 = new ProductReview();

	static List<ProductReview> prodList = new ArrayList<>();
	static JSONObject mockProdJson;

	@BeforeClass
	public static void initialize() throws JSONException {


	}

	

}
