# Run tests

Just run `./gradlew test --info` to reproduce the error described in https://github.com/gradle/gradle/issues/31862. You should see the following test output:

```
...
Caused by: java.lang.IllegalStateException: Problems service is not initialized.
	at org.gradle.api.problems.internal.ProblemsProgressEventEmitterHolder.get(ProblemsProgressEventEmitterHolder.java:28)
	at org.gradle.internal.execution.impl.DefaultWorkValidationContext.getProblemsService(DefaultWorkValidationContext.java:48)
	at org.gradle.internal.execution.impl.DefaultWorkValidationContext.forType(DefaultWorkValidationContext.java:55)
	at org.gradle.internal.execution.steps.ValidateStep.validateImplementations(ValidateStep.java:124)
	at org.gradle.internal.execution.steps.ValidateStep.lambda$execute$0(ValidateStep.java:78)
	at java.base/java.util.Optional.ifPresent(Optional.java:178)
	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:78)
	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:56)
...
```
