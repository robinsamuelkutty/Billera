package in.robinsam.bilingsoftware.controller;

import in.robinsam.bilingsoftware.io.CategoryRequest;
import in.robinsam.bilingsoftware.io.CategoryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @PostMapping
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){

    }

}
