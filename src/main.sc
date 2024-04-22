require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Бастайық.

    state: Hello
        intent!: /hello
        a: Сәлеметсіз бе!

    state: Bye
        intent!: /bye
        a: Дейін!

    state: NoMatch
        event!: noMatch
        a: Мен түсінбедім. Сен дедің: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}