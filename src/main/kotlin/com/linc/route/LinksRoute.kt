package com.linc.route

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val REDIRECT_BASE_HRL = "app://bookstore"

fun Route.linksRoute() {
    get("/books") {
        call.respondRedirect("$REDIRECT_BASE_HRL/books")
    }
    get("/books/{id}") {
        call.respondRedirect("$REDIRECT_BASE_HRL/books/${call.parameters["id"]}")
    }
    get("/cart") {
        call.respondRedirect("$REDIRECT_BASE_HRL/cart")
    }
}