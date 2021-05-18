package com.map.todo.category.`interface`

import com.map.todo.category.model.CategoryModel


interface CategoryUpdate {
    fun isCategoryUpdated(isUpdated: Boolean, mArrayList: ArrayList<CategoryModel>)
}