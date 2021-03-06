package com.hyperledger.fabric.sdk.entity.dto.api;

import java.io.Serializable;
import java.util.Properties;

/**
 * Created by L.Answer on 2018-09-03 19:03
 *
 * peer节点DTO
 */
public class PeerNodeDTO extends NodeDTO implements Serializable {

    private String evenHubUrl;

    public PeerNodeDTO(String nodeName, String grpcUrl) {
        super(nodeName, grpcUrl);
    }

    public PeerNodeDTO(String nodeName, String grpcUrl, String evenHubUrl) {
        super(nodeName, grpcUrl);
        this.evenHubUrl = evenHubUrl;
    }

    public PeerNodeDTO(String nodeName, String grpcUrl, String evenHubUrl, Properties properties) {
        super(nodeName, grpcUrl, properties);
        this.evenHubUrl = evenHubUrl;
    }

    public String getEvenHubUrl() {
        return evenHubUrl;
    }

    public void setEvenHubUrl(String evenHubUrl) {
        this.evenHubUrl = evenHubUrl;
    }
}