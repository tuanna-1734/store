package com.anhtuan.store.service;

import com.anhtuan.store.dto.request.ProductAddEditDto;
import com.anhtuan.store.dto.response.ProductResponseDto;
import com.anhtuan.store.model.DiscountEntity;
import com.anhtuan.store.model.ProductEntity;

public interface CommonService {
    ProductResponseDto transformProductEntityToDto(ProductEntity productEntity);

    ProductAddEditDto transformToAdminProductDtoUpdate(ProductEntity productEntity);

    Boolean isValidDiscount(DiscountEntity discountEntity);
}
