import React from "react";
import { Dialog, DialogTitle, Button } from "@material-ui/core";

export const ExitDialog = (props) => {
  const { open, onClose } = props;

  return (
    <Dialog open={open}>
      <DialogTitle>
        Your session will be deleted from server. Do you want to exit?
      </DialogTitle>
      <Button>
        yes
      </Button>
      <Button onClick={onClose}>
        cancel
      </Button>
    </Dialog>
  );
}