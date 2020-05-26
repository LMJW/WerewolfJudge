import React, { useState } from "react";
import { Dialog, Typography, TextField, Button, DialogTitle, Grid } from "@material-ui/core";


export const FindGameDialog = (props) => {
  const { open, onClose } = props;
  return (
    <Dialog open={open}>
      <DialogTitle>
        Enter the room name/id that you want to search:
      </DialogTitle>
      <Grid container direction='column' alignItems='center' >
        <Grid item >
          <TextField
            variant='outlined'
            required
            id="room"
            label="room name/id"
            name="room"
            autoFocus />
        </Grid>
        <Grid container direction='row' justify='space-evenly'>
          <Grid item >
            <Button variant='text' color='primary'>
              search
          </Button>
          </Grid>
          <Grid item>
            <Button variant='text' onClick={onClose}>
              close
          </Button>
          </Grid>
        </Grid>
      </Grid>
    </Dialog>
  );
}

