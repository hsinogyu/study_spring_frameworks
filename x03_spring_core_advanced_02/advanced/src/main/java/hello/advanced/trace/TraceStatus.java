package hello.advanced.trace;

// traceId: 로그를 시작할 때 상태 정보를 가지고 있음
// startTime: 로그 시작 시간
// message: 시작 시 사용한 메시지. 이후 로그 종료시에도 이 메시지를 사용해서 출력함
public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs;
    private String message;

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
