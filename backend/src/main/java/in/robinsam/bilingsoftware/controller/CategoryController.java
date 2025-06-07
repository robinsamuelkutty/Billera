package in.robinsam.bilingsoftware.controller;

import in.robinsam.bilingsoftware.io.CategoryRequest;
import in.robinsam.bilingsoftware.io.CategoryResponse;
import in.robinsam.bilingsoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory(@RequestBody CategoryRequest request){
        return categoryService.add(request);

    }

}
