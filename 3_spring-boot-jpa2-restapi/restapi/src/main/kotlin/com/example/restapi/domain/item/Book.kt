package com.example.restapi.domain.item

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("book")
class Book(
    var author: String? = null,
    var isbn: String? = null
): Item()
{
    companion object {
        internal fun createBookOrder(name: String, price: Int, stockQuantity: Int): Book {
            val book = Book()
            book.name = name
            book.price = price
            book.stockQuantity = stockQuantity

            return book
        }
    }
}