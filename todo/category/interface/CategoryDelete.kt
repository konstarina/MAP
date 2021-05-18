package com.map.todo.category.`interface`

import com.map.todo.category.model.CategoryModel


interface CategoryDelete {
    fun isCategoryDeleted(isDeleted: Boolean, mArrayList: ArrayList<CategoryModel>)
}