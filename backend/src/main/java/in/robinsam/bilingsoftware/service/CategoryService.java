package in.robinsam.bilingsoftware.service;

import in.robinsam.bilingsoftware.io.CategoryRequest;
import in.robinsam.bilingsoftware.io.CategoryResponse;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request);
}
