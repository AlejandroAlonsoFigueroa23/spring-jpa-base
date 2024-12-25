package alejandro.figueroa.manejoTransaccional;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionStatus;

public class TrxManagerImpl implements PlatformTransactionManager{

	@Override
	public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
		System.out.println("///////// No hace ni madres//////////");
		return new DefaultTransactionStatus(null, true, true, true, true, null);
	}

	@Override
	public void commit(TransactionStatus status) throws TransactionException {
		System.out.println("////////////Tampoco hace ni madres /////////");
		
	}

	@Override
	public void rollback(TransactionStatus status) throws TransactionException {
		// TODO Auto-generated method stub
		
	}

}
