FROM java:7
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac question1.java
CMD ["java", "question1"]
