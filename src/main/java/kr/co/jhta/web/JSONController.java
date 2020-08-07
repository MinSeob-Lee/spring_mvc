package kr.co.jhta.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.jhta.service.ProductService;
import kr.co.jhta.vo.Product;

/*
 * @ResponseBody
 * 		- 요청핸들러 메소드가 반환하는 값(객체, Map, 콜렉션)을 특정 타입의 컨텐츠로
 * 		    변환해서 응답메세지의 body에 담아보낼 때 사용하는 어노테이션이다.
 */

@Controller
@RequestMapping("/json")
public class JSONController {

	@Autowired
	ProductService productService;
	
	// 모든 상품정보를 json 형식의 텍스트로 제공하는 요청핸들러 메소드
	@GetMapping("/products.do")
	@ResponseBody
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return products;
	}

	@GetMapping("/product.do")
	public @ResponseBody Product getProduct(@RequestParam("no") int productNo) {
		Product product = productService.getProductDetail(productNo);
		return product;
	}
	
	// 상품번호에 해당하는 상품정보를 json 형식의 텍스트로 제공하는 요청핸들러 메소드
	
	
}
