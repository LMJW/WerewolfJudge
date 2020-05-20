package WerewolfJudge;

import org.lognet.springboot.grpc.GRpcService;

import WerewolfJudge.grpc.Game.ActionRequest;
import WerewolfJudge.grpc.Game.ActionResponse;
import WerewolfJudge.grpc.PlayerActionGrpc.PlayerActionImplBase;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@GRpcService
public class PlayerActionService extends PlayerActionImplBase {
  @Override
  public void action(ActionRequest request, StreamObserver<ActionResponse> responseObserver) {
    final ActionResponse.Builder rBuilder = ActionResponse.newBuilder().setResult("testing");
    responseObserver.onNext(rBuilder.build());
    responseObserver.onCompleted();
  }
}