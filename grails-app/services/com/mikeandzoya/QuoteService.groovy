package com.mikeandzoya

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def getStaticQuote() {
        return new Quote(author : "Mike", content : "Grails is interesting")
    }

    def getRandomQuote() {
        def allQuotes = Quote.list()
        def randomQuote
        if(allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = new Quote(author : "Mike", content : "Grails is interesting")
        }

        return randomQuote
    }
}
