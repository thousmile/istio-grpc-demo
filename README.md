# istio grpc demo

# 切记 Pod, Service , Deployment , VirtualService , DestinationRule 等... 的名称。
# 禁止命名为 “grpc-client” ，“grpc-server” 等。不然会报一些稀奇古怪的错误

```shell

docker build -t istio-grpc-client:1.1 .

docker build -t istio-grpc-server:1.1 .

```
