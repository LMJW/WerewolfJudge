# Werewolf Judge backend

## Design

The backend will have three parts. The first part will be a HTTP server which
will handle the user login, game join and creation. This will be implemented
using a RESTful interface. 

The second part will handle the actual game. Player will need to establish a
dual way communication with the server so that server can push state update to
the game client. My current thought of the ways of communication is using gRPC. 

In addition to this, we will also have Game manager that in charges of updating
different Game instance state. 

In summary, there will be three parts, which are webserver, gRPC server and an in
memory Game state management component.