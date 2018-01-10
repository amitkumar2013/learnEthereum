package com.example.blockchain.ethereum;

import org.ethereum.facade.Blockchain;
import org.ethereum.facade.Ethereum;
import org.ethereum.facade.EthereumFactory;

public class EthereumBean {

	Ethereum ethereum;

	public void start() {
		this.ethereum = EthereumFactory.createEthereum();
		this.ethereum.addListener(new EthereumListener(ethereum));
	}

	public String getBestBlock() {
		Blockchain blkChain = ethereum.getBlockchain();
		return "" + blkChain.getBestBlock().getNumber();
	}
}