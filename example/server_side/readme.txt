
�뱣֤����˵�URL��andreport�ṹ�ļ��е�URL���÷��ϣ���jsp�Ĵ���Ϊ����

	/***************************************************************/
	//��ȡ��ҳ����
	/***************************************************************/	
	//�ͻ����ύ�ķ�ҳ���ݡ�
	//ÿҳ��ʾ������
	String itemsPerPage = request.getParameter("itemsPerPage");
	//��ǰҳ
	String pageNumber = request.getParameter("pageNumber");



	/***************************************************************/
	//��ѯ dt:serachURL="http://192.168.0.8:8088/android_ch24_serverside/getList.jsp"
	//
	//��ѯ��url����������ѯ��ť����д��ѯ�������ύ��ѯ����url
	//
	//��ȡ��ѯ����
	/***************************************************************/	
	/*
	<searchPanel>
	    <searchItem dt:label="��ţ�" dt:key="id" dt:type="text" dt:remark=""/>
	    <searchItem dt:label="������" dt:key="cusName"/>
	    <searchItem dt:label="�Ա�" dt:key="grade" dt:type="radio" dt:options="[��,Ů,����]" dt:defaultValue="����"/>
	    <searchItem dt:label="�绰��" dt:key="phoneNumber"/>
	    <searchItem dt:label="״̬��" dt:key="classStatus" dt:type="checkBox" dt:options="[�߼��ͻ�,��ͨ�ͻ�,Ǳ�ڿͻ�]" dt:defaultValues="[�߼��ͻ�,��ͨ�ͻ�]"/>
	</searchPanel>	
	*/
	//��ѯ����
	String id = request.getParameter("id");
	String cusName = request.getParameter("cusName");
	String grade = request.getParameter("grade");
	String phoneNumber = request.getParameter("phoneNumber");
	String classStatus = request.getParameter("classStatus");





	/***************************************************************/
	//�༭ dt:editAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/editAndGetList.jsp"
	//	
	/�༭��url�������ڵ����ı༭panel���޸����ݲ��ύ�����url
	//
	//��ȡ�༭����
	/***************************************************************/	
	/*
	<editPanel>
	    <editItem dt:label="��ţ�" dt:key="id" dt:editable="false"/>
	    <editItem dt:label="������" dt:key="cusName"/>
	    <editItem dt:label="�Ա�" dt:key="grade" dt:type="radio" dt:options="[��,Ů]"/>
	    <editItem dt:label="�绰��" dt:key="phoneNumber" dt:type="text" dt:remark="*����й©"/>
	    <editItem dt:label="״̬��" dt:key="status" dt:type="radio" dt:options="[�߼��ͻ�,��ͨ�ͻ�,Ǳ�ڿͻ�]"/>
	</editPanel>
	*/
	//�༭��paramete
	String id = request.getParameter("id");
	String cusName = request.getParameter("cusName");
	String grade = request.getParameter("grade");
	String phoneNumber = request.getParameter("phoneNumber");
	String classStatus = request.getParameter("status");




	/***************************************************************/
	//���� dt:addedAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/addAndGetList.jsp"
	//	
	//������url��������������ť����д������Ϣ���ύ����������url
	//
	//��ȡ�༭����
	/***************************************************************/	
	/*
	<addPanel>
	    <addItem dt:label="������" dt:key="cusName" dt:type="text" dt:remark=""/>
	    <addItem dt:label="�Ա�" dt:key="grade" dt:type="radio" dt:options="[��,Ů]" dt:defaultValue="��"/>
	    <addItem dt:label="�绰��" dt:key="phoneNumber"/>
	    <addItem dt:label="״̬��" dt:key="status" dt:type="radio" dt:options="[�߼��ͻ�,��ͨ�ͻ�,Ǳ�ڿͻ�]"  dt:defaultValue="��ͨ�ͻ�"/>
	</addPanel>
	*/
	//�༭��paramete
	String cusName = request.getParameter("cusName");
	String grade = request.getParameter("grade");
	String phoneNumber = request.getParameter("phoneNumber");
	String classStatus = request.getParameter("status");


	

	/***************************************************************/
	//ɾ�� dt:deleteAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/deleteAndGetList.jsp"
	//
	//ɾ����url������Action���е�ɾ����ť��ɾ��ĳ����¼ʱ�ύ�����url
	//
	//ɾ��������¼ʱ����ȡ id ����
	/***************************************************************/		
	//id paramete
	String id = request.getParameter("id");



	/***************************************************************/
	//����ɾ�� dt:multipleDeleteAndGetListActionURL="http://192.168.0.8:8088/android_ch24_serverside/multipleDeleteAndGetList.jsp"
	//	
	//����ɾ����url������ͨ��checkBox��ѡ��󣬵����������ɾ����ť���ύ�����url
	//
	//����ɾ����¼ʱ����ȡ ids ����
	/***************************************************************/
	//ids paramete
	String id = request.getParameter("ids");
	System.out.println("ids:"+id);	


	/***************************************************************/
	//��ȡ���� dt:findEditItemByIdURL="http://192.168.0.8:8088/android_ch24_serverside/findEditItemById.jsp"
	//			
	//�༭ĳ��¼��url��������action���еı༭��ť������ id���� ��ȡ����˶�Ӧ�ļ�¼����ʾ�ڱ༭panel��
	//
	/***************************************************************/	
	//id paramete
	String id = request.getParameter("id");


	/***************************************************************/
	//��ȡ���� dt:findViewItemByIdURL="http://192.168.0.8:8088/android_ch24_serverside/findViewItemById.jsp"
	//				
	//�鿴ĳ��¼�����url��������action���еĲ鿴��ť������ id���� ��ȡ����˶�Ӧ��¼�����飬��ʾ�ڲ鿴panel��
	//
	/***************************************************************/	
	//id paramete
	String id = request.getParameter("id");









	

