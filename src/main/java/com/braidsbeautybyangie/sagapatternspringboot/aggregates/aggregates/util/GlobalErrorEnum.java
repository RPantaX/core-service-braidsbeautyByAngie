package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates.util;

import com.braidsbeautybyangie.sagapatternspringboot.aggregates.AppExceptions.TypeException;

public enum GlobalErrorEnum implements GenericError{

    //ERRORS
    //CATEGORIES
    CATEGORY_NOT_FOUND_ERC00008("ERC00008", "Category Not Found", "The requested category does not exist.", TypeException.E),
    CATEGORY_ALREADY_EXISTS_ERC00009("ERC00009", "Category Already Exists", "A category with the same identifier already exists.", TypeException.E),
    CATEGORY_CREATION_FAILED_ERC00010("ERC00010", "Category Creation Failed", "Failed to create the category due to an internal error.", TypeException.E),
    CATEGORY_UPDATE_FAILED_ERC00011("ERC00011", "Category Update Failed", "Failed to update the category due to an internal error.", TypeException.E),
    CATEGORY_DELETION_FAILED_ERC00012("ERC00012", "Category Deletion Failed", "Failed to delete the category due to an internal error.", TypeException.E),
    CATEGORY_LISTING_FAILED_ERC00013("ERC00013", "Category Listing Failed", "Failed to retrieve the list of categories due to an internal error.", TypeException.E),
    CATEGORY_INVALID_DATA_ERC00014("ERC00014", "Invalid Category Data", "The provided category data is invalid or incomplete.", TypeException.E),
    //PROMOTIONS
    PROMOTION_NOT_FOUND_ERPN00022("ERPN00022", "Promotion Not Found", "The requested promotion does not exist.", TypeException.E),
    PROMOTION_ALREADY_EXISTS_ERPN00023("ERPN00023", "Promotion Already Exists", "A promotion with the same identifier already exists.", TypeException.E),
    PROMOTION_CREATION_FAILED_ERPN00024("ERPN00024", "Promotion Creation Failed", "Failed to create the promotion due to an internal error.", TypeException.E),
    PROMOTION_UPDATE_FAILED_ERPN00025("ERPN00025", "Promotion Update Failed", "Failed to update the promotion due to an internal error.", TypeException.E),
    PROMOTION_DELETION_FAILED_ERPN00026("ERPN00026", "Promotion Deletion Failed", "Failed to delete the promotion due to an internal error.", TypeException.E),
    PROMOTION_LISTING_FAILED_ERPN00027("ERPN00027", "Promotion Listing Failed", "Failed to retrieve the list of promotions due to an internal error.", TypeException.E),
    PROMOTION_INVALID_DATA_ERPN00028("ERPN00028", "Invalid Promotion Data", "The provided promotion data is invalid or incomplete.", TypeException.E),


    //WARNING Errors
    //PROMOTIONS
    PROMOTION_NAME_REQUIRED_WPN00003("WPN00003", "Promotion Name Required", "The promotion name is required and cannot be empty.", TypeException.W),
    PROMOTION_DESCRIPTION_REQUIRED_WPN00004("WPN00004", "Promotion Description Required", "The promotion description is required and cannot be empty.", TypeException.W),
    PROMOTION_DISCOUNT_RATE_REQUIRED_WPN00005("WPN00005", "Promotion Discount Rate Required", "The promotion discount rate is required and must be a valid number.", TypeException.W),
    PROMOTION_START_DATE_REQUIRED_WPN00006("WPN00006", "Promotion Start Date Required", "The promotion start date is required and must be a valid date.", TypeException.W),
    PROMOTION_END_DATE_REQUIRED_WPN00007("WPN00007", "Promotion End Date Required", "The promotion end date is required and must be a valid date.", TypeException.W),
    PROMOTION_REQUIRED_WPN00008("WPN00008", "Promotion Required", "The promotion is required and cannot be empty.", TypeException.W),
    //CATEGORIES
    CATEGORY_NAME_REQUIRED_WC00001("WC00001", "Category Name Required", "The category name is required and cannot be empty.", TypeException.W),
    CATEGORY_REQUIRED_WC00002("WC00002", "Category Required", "The category is required and cannot be empty.", TypeException.W),
            ;
    private GlobalErrorEnum(String code, String title, String message, TypeException type) {
        this.code = code;
        this.title = title;
        this.message = message;
        this.type = type;
    }
    private final String code;
    private final String title;
    private final String message;
    private final TypeException type;


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public TypeException getType() {
        return type;
    }
}
