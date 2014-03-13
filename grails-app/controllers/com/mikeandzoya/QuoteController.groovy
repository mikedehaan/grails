package com.mikeandzoya

class QuoteController {

    static scaffold = true

    def quoteService

    def index() {
        redirect(action: "home")
    }

    def home() {

    }

    def random() {
        def randomQuote = quoteService.getRandomQuote()
        [quote : randomQuote]
    }
}
