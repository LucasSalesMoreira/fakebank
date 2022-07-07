# Fakebank API

## User:
- [GET] { host } / user
- [POST] { host } / uer
  - body { name: "", email: "", pass: "", money: 0.0 }
- [PUT] { host } / user / { id }
  - body { name: "", email: "", pass: "", money: 0.0 }
- [DELETE] { host } / user / { id }

## Pix:
- [POST] { host } / pix
  - body { senderId: "", recipientId: "" value: 0.0 }
