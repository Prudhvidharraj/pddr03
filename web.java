---
- hosts: pddrserver
  remote_user: root
  become: yes
  tasks:
    - name: pddr installing
      yum: name=httpd state=installed
    - name: copy index.html
      copy: src=pgy.html dest=/var/www/html
    - name: service start
      service: name=httpd state=started
