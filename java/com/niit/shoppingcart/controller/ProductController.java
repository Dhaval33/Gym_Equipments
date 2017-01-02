package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.util.FileUtil;


@Controller
public class ProductController {
	
	public static Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Product product;
	
	
	
	//private String path= "D:\\ShoppingCart\\Images";
	//"C:\\Users\\Asha\\Desktop\\ShoppingCartFrontEnd\\src\\main\\webapp\\Resources\\Images
	
	private String path = "Resources/Images/";
	

	@RequestMapping(value="/manage_products", method=RequestMethod.GET)
	public String listCategories( @ModelAttribute("product") Product product, Model model){
		log.debug("Starting of the method listProducts");
		model.addAttribute("product", product);
		model.addAttribute("productList",this.productDAO.list());
		model.addAttribute("isAdminClickedProducts", "true");
		log.debug("Ending of the method listProducts");
		return "index";
		}
	
	//For add and update product both
	
	@RequestMapping(value="/manage_product_add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,  @RequestParam("image") MultipartFile file, Model model , HttpServletRequest request)
	{ log.debug("Starting of the method addProduct");
	Category category = categoryDAO.getByName(product.getCategory().getName());
	Supplier supplier = supplierDAO.getByName(product.getSupplier().getName());
	
	product.setCategory(category);
	product.setSupplier(supplier);
	product.setCategory_id(category.getId());
	product.setSupplier_id(supplier.getId());
	
	productDAO.saveOrUpdate(product);
	 if(productDAO.saveOrUpdate(product)== true){
		 model.addAttribute("msg", "Sucessfully created/updated the product");
		 }
		
		else
		{
			model.addAttribute("msg", "Not able to create/update the product, please re-enter the ID again to verify");
		}
	//HttpSession session=request.getSession(true);
	//session.setAttribute("ProductList", productDAO.list());
	FileUtil.upload(path, file, (product.getId() + ".jpg"));
    
    model.addAttribute("isAdminClickedProducts", "true");
    model.addAttribute("productList", productDAO.list());
    model.addAttribute("product", product);
    log.debug("Ending of the method addProduct");
    
    return "index";
    //return "redirect:/uploadFile";
	}
	
    @RequestMapping("manage_product_remove")
    public String removeProduct(@RequestParam("id") String id, Model model) throws Exception
    {log.debug("Starting of the method removeProduct");
    try{
    	boolean flag= productDAO.delete(id);
    	if(flag== true){
    		model.addAttribute("msg", "Successfully deleted");
    	}
    	
    }
    catch(Exception e){

    	model.addAttribute("msg", e.getMessage());
    	e.printStackTrace();
    	}
    log.debug("Ending of the method removeProduct");
    return "forward:/manage_products";
    
	}
    
    
    @RequestMapping("manage_product_edit")
    public String editProduct(@RequestParam("id") String id, Model model)
    { 
    	log.debug("Starting of the method editProduct");
  
       product= productDAO.get(id);
       model.addAttribute("selectedProduct", product);
       log.debug("End of the method editProduct");
       return "forward:/manage_products";
    }

	
	// get the product details
    @RequestMapping("manage_product/get/{id}")
    public ModelAndView getSelectedProduct(@PathVariable("id") String id, RedirectAttributes redirectAttributes )
    {
    	log.debug("Starting of the method getSelectedProduct");
    	ModelAndView mv= new ModelAndView("redirect:/index");
    	redirectAttributes.addFlashAttribute("selectedProduct", productDAO.get(id));
    	log.debug("Ending of the method getSelectedProduct");
        return mv;
     }
    
    @RequestMapping("/index")
    public String reDirectToHome(@ModelAttribute("selectedProduct") final Product selectedProduct , final Model model){
    	log.debug("Starting of the method redirectToHome");
    	model.addAttribute("selectedProduct", selectedProduct);
    	model.addAttribute("categoryList", this.categoryDAO.list());
    	model.addAttribute("productList", this.productDAO.list());
    	log.debug("Ending of the method reDirectToHome");
    	return "/index";
    	
    	
    			
    }
    
    
    @RequestMapping(value="/open_category")
	 public ModelAndView getSelectedCategory(@RequestParam("name")String name){
		 System.out.println(name+"test");
		 ModelAndView mv=new ModelAndView("/index");
		 mv.addObject("name",name);
		 mv.addObject("categoryList",this.categoryDAO.list());
		 mv.addObject("productList",this.productDAO.list());
		
		 
		 return mv;
	 }
}

