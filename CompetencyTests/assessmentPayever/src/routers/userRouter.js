const express = require('express')
const router = express.Router()

const userController = require('../controllers/userController')

const upload = require('../config/multer')

// POST USER
router.post('/api/users', upload.single('file'), userController.create)

// GET USERID
router.get('/api/user/:id', userController.select)

// DELETE USERID
router.delete('/api/user/:id', userController.delete)

module.exports = router