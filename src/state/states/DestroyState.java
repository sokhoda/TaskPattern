package state.states;

import state.ExecResult;
import state.ServletLifeCycle;

public class DestroyState extends State {
	static ExecResult res = ExecResult.getRandRes();

	public DestroyState() {
	}

	@Override
	public void nextState(ServletLifeCycle context) {
		String message = "Not valid ExecResult value";
		setRandExecResult(this);
		switch (getExecResult()) {
		case SUCCESS:
			message = "Hopping to END";
			context.setCurState(null);
			break;
		case FAIL:
			message = "Staying in " + this;
		}
		System.out.println(message);
		doSomething();
		System.out.println("Now I'm in " + context.getCurState());

		if (context.getCurState() != null) {
			context.getCurState().nextState(context);
		}
	}

	@Override
	public void doSomething() {
		System.out.println("Cannot do in " + this + "!\n");
	}

	@Override
	public String toString() {
		return "DestroyState";
	}

}
