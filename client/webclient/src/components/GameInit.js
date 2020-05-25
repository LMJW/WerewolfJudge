import React, { useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Grid from '@material-ui/core/Grid';
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Checkbox from '@material-ui/core/Checkbox';
import { Button, Dialog } from '@material-ui/core';
import CharacterSelectionDialog from './CharacterSelectionDialog';



export default function GameInit() {
  const [openDialog, setOpenDialog] = useState(false);

  const handleOnOpen = () => {
    setOpenDialog(true);
  }

  const handleOnClose = () => {
    setOpenDialog(false);
  }

  return (
    <React.Fragment>
      <Typography variant="h6" gutterBottom>
        Create a new game
      </Typography>
      <Grid container spacing={3}>
        <Grid item xs={12} sm={6}>
          <Button variant="contained" onClick={handleOnOpen}>Add Characters</Button>
        </Grid>
      </Grid>
      <CharacterSelectionDialog open={openDialog} onClose={handleOnClose} />

    </React.Fragment>
  );
}