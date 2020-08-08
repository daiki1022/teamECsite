package jp.co.internous.node.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.node.model.domain.MstProduct;
import jp.co.internous.node.model.mapper.MstProductMapper;
import jp.co.internous.node.model.session.LoginSession;

@Controller
@RequestMapping("/node/product")
public class ProductController {
	@Autowired
	LoginSession loginSession;
	
	@Autowired
	MstProductMapper productMapper;
	
	@RequestMapping("/{id}")
	public String index(@PathVariable("id") long id,  Model m) {
		MstProduct product = productMapper.findByProductId(id);
				m.addAttribute("product", product);	
				m.addAttribute("loginSession", loginSession);
		return "product_detail";
	}
}
