import React, { useState } from "react";
import { Typography, ListItem, ListItemAvatar, Avatar, ListItemText, List, Grid, Button, ListItemSecondaryAction, ListItemIcon, IconButton } from "@material-ui/core";
import AccountCircleIcon from '@material-ui/icons/AccountCircle';
import ExitToAppIcon from '@material-ui/icons/ExitToApp';
import CheckBoxIcon from '@material-ui/icons/CheckBox';
import CancelIcon from '@material-ui/icons/Cancel';
import DeleteForeverIcon from '@material-ui/icons/DeleteForever';

export const GameRoom = (props) => {
  const [players, setPlayers] = useState([{ name: 'Bob', ready: true }, { name: 'James', ready: false }]);
  const [ishost, setIsHost] = useState(true);

  return (
    <div>
      <Grid container direction='column' justify='center'>
        <Grid item>
          <Typography>
            Room
          </Typography>
        </Grid>
        <Grid item>
          <Button>
            <ExitToAppIcon />
            <Typography>
              Go back
            </Typography>
          </Button>
        </Grid>
        <Grid container>
          Players joined
        </Grid>
        <Grid container >
          <List>
            {players.map((player) => (
              <ListItem >
                <ListItemAvatar>
                  <Avatar>
                    <AccountCircleIcon />
                  </Avatar>
                </ListItemAvatar>
                <ListItemText primary={player.name} />
                <ListItemIcon>
                  {player.ready ? <CheckBoxIcon /> : <CancelIcon />}
                </ListItemIcon>
                <ListItemSecondaryAction>
                  <IconButton >
                    <DeleteForeverIcon />
                  </IconButton>
                </ListItemSecondaryAction>
              </ListItem>
            ))}
          </List>
        </Grid>

        <Grid item>
          <Grid container direction='row' justify='center'>
            <Button>
              {ishost ? 'Start' : 'Get ready'}
            </Button>

            <Button>
              Cancel
            </Button>
          </Grid>
        </Grid>
      </Grid>
    </div>
  );
}