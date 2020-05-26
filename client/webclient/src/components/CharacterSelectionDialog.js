import React, { useState, useEffect } from "react";
import { Dialog, DialogTitle, ListItem, ListItemText, List, ListItemIcon, TextField, Grid, Button } from "@material-ui/core";
import AddIcon from '@material-ui/icons/Add';
import RemoveIcon from '@material-ui/icons/Remove';

const allCharacters = [
  { name: 'Villager', count: 0 },
  { name: 'Werewolf', count: 0 },
  { name: 'Seer', count: 0 },
  { name: 'Witch', count: 0 },
  { name: 'Guardian', count: 0 },
  { name: 'Hunter', count: 0 },
  { name: 'Idiot', count: 0 }
];

export default (props) => {
  const { onClose, open } = props;

  const [charsCount, setCharsCount] = useState(allCharacters);
  const [totalChars, setTotalChars] = useState(0);

  const handleClose = () => {
    onClose(charsCount);
  };

  const handleAddCharacter = (name) => {
    var total = 0;
    setCharsCount(charsCount.map(ele => {
      if (ele.name !== name) {
        total += ele.count;
        return ele;
      }
      total += (ele.count + 1);
      return { ...ele, count: ele.count + 1 }
    }));
    setTotalChars(total);
  }

  return (
    <Dialog onClose={handleClose} open={open}>
      <DialogTitle>
        Select character to add
      </DialogTitle>
      <List>
        {charsCount.map((item) => (
          <ListItem>
            <Grid container direction='row' alignItems='center'>
              <Grid item xs={6}>
                <ListItemText primary={item.name} />
              </Grid>

              <Grid item xs={2}>
                <ListItem button onClick={() => (handleAddCharacter(item.name))}>
                  <ListItemIcon >
                    <AddIcon />
                  </ListItemIcon>
                </ListItem>

              </Grid>
              <Grid item xs={2}>
                <ListItem button>
                  <ListItemIcon>
                    <RemoveIcon />
                  </ListItemIcon>
                </ListItem>
              </Grid>

              <Grid item xs={2}>
                <TextField type="number" value={item.count} size='small' />
              </Grid>
            </Grid>
          </ListItem>
        ))}
        <ListItem>
          <ListItemText primary={`Total Characters: ${totalChars}`}></ListItemText>
        </ListItem>
        <Button>Create</Button>
        <Button>Cancel</Button>
      </List>

    </Dialog>
  );
}