package com.bethfordj.dao.model;

public enum BusinessSortOrder {
    GENERAL_TYPE("GeneralType"), RATING_HIGH_TO_LOW("RatingHighToLow"), RATING_LOW_TO_HIGH("RatingLowToHigh");

	
    public final String label;
    
    private BusinessSortOrder(String label) {
        this.label = label;
    }

    public static BusinessSortOrder valueOfLabel(String label) {
        for (BusinessSortOrder businessSortOrder : values()) {
            if (businessSortOrder.label.equalsIgnoreCase(label)) {
                return businessSortOrder;
            }
        }
        return null;
    }
}
