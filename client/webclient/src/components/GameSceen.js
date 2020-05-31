import React, { useState } from "react";
import { Typography, ListItem, ListItemText, Grid, Button, IconButton, List } from "@material-ui/core";
import LocalDiningIcon from '@material-ui/icons/LocalDining';
import VisibilityIcon from '@material-ui/icons/Visibility';


export const GameSceen = (props) => {
  const [state, setState] = useState({
    gamestage: '1st night',
    info: [
      'night comes, everyone close eye...',
      'werewolf please kill someone...',
      'witch please choose your action...',
      '...'
    ],
  })

  const { gamestage, info } = state;
  return (
    <div>
      <Typography>
        {gamestage}
      </Typography>
      {info.map((msg) => (
        <List>
          <ListItem>
            <ListItemText primary={msg} />
          </ListItem>
        </List>
      ))}
      <Grid container>
        <Grid item>
          <Button
            startIcon={<LocalDiningIcon />}
          >
            werewolf
          </Button>
        </Grid>
        <Grid item>
          <Button
            startIcon={<VisibilityIcon />}
          >
            seer
          </Button>
        </Grid>
      </Grid>
    </div>
  );
}

