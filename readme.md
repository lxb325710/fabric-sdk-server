# Fabric-SDK-Java 封装版项目
- [x] 适用对象: 入门 Hyperledger Fabric



### resources 目录结构说明
```bash
    # 链码存放目录
    chaincodes
        EG: /resources/chaincodes/sample/src/github.com/chaincode_example02/chaincode_example02.go
            chaincodePath: github.com/chaincode_example02
            chaincodeSourceLocation: .../chaincodes/sample
    
    # 通道配置及证书信息
    channel-artifacts
    crypto-config
```









### 注意事项
```bash
    # 注释掉tls配置
    1. vim base/peer-base.yaml
        CORE_PEER_TLS_ENABLED=true 
            改为
        CORE_PEER_TLS_ENABLED=false


    2. vim base/docker-compose-base.yaml
        ORDERER_GENERAL_TLS_ENABLED=true
            改为
        ORDERER_GENERAL_TLS_ENABLED=false
    
    3. vim examples/e2e_cli/docker-compose-cli.yaml
        CORE_PEER_TLS_ENABLED=true
            改为
        CORE_PEER_TLS_ENABLED=false            
                    
```



