import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Grid from '@material-ui/core/Grid';
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Checkbox from '@material-ui/core/Checkbox';



export default function RoomCreation() {
  return (
    <React.Fragment>
      <Typography variant="h6" gutterBottom>
        Create a game room
      </Typography>
      <Grid container spacing={3}>
        <Grid item xs={12} sm={6}>
          <TextField
            required
            id="roomName"
            name="roomName"
            label="Room name"
            fullWidth
          />
        </Grid>
      </Grid>
      <Grid item xs={12} sm={6}>
        <TextField id="password" name="password" label="Room password (default no password)" fullWidth />
      </Grid>
    </React.Fragment>
  );
}