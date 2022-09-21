## Connect to in-process inspector from Emacs + Cider

At the command promt run:

    clj -M:jfx/rebl:jfx/cider

Then connect in Emacs with `cider-connect`

In the CIDER REPL:

    (require 'cognitect.rebl)
    (cognitect.rebl/ui :mode :in-proc)

Send an expression to the inspector:

    (cognitect.rebl/inspect ...expression...)

## Connect to in-process inspector from Calva (jack-in)

1. Open this project's folder in Calva.
2. Type the keystrokes `ctrl+alt+c ctrl+alt+j` to initiate a REPL launch.
3. Choose `deps.edn` from the drop-down
4. Choose the `:jfx/rebl` and `:jfx/cider` aliases then click *Ok*

In Calva evaluate the following:

    (require 'cognitect.rebl)
    (cognitect.rebl/ui :mode in-proc)

Send an expression to the inspector:

    (cognitect.rebl/inspect ...expression...)
