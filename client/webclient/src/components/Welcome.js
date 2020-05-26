import React, { useState } from "react";
import { Typography, Grid, Button } from "@material-ui/core";
import { FindGameDialog } from "./FindGameDialog";
import { ExitDialog } from "./ExitDialog";


export default (props) => {
  const [findGameDialog, setFindGameDialog] = useState(false);
  const [exitDialog, setExitDialog] = useState(false);

  const handleOpenFindGameDialog = () => {
    setFindGameDialog(true);
  }

  const handleCloseFindGameDialog = () => {
    setFindGameDialog(false);
  }

  const handleOpenExitDialog = () => {
    setExitDialog(true);
  }

  const handleCloseExitDialog = () => {
    setExitDialog(false);
  }

  return (
    <div>
      <Typography variant='h4'>
        Welcome to werewolf judge!
      </Typography>
      <Grid container direction='column'>
        <Grid item>
          <Button color='primary'>
            Create a new game room
          </Button>
        </Grid>
        <Grid item>
          <Button color='primary' onClick={handleOpenFindGameDialog}>
            Find a game
          </Button>
        </Grid>
        <Grid item>
          <Button color='primary' onClick={handleOpenExitDialog}>
            Exit
          </Button>
        </Grid>
      </Grid>
      <FindGameDialog open={findGameDialog} onClose={handleCloseFindGameDialog} />
      <ExitDialog open={exitDialog} onClose={handleCloseExitDialog} />
    </div>
  );
}