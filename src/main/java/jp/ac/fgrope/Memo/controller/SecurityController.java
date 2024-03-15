package jp.ac.fgrope.Memo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jp.ac.fgrope.Memo.service.MemoBookService;
@Controller
public class SecurityController{

@Autowired
private MemoBookService MemoBookService;

@GetMapping("/")
public String index(Model model) {
//	model.addAttribute("list",this.MemoBookService.getMemoList());
	
	return "saisyo";
}

@GetMapping("/logout")
public String logout(HttpServletRequest request) {
    HttpSession session = request.getSession(false);
    if (session != null) {
        session.invalidate(); 
    }
    return "redirect:/"; 
}
}