"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.createCourse = void 0;
const CreateCoursesService_1 = __importDefault(require("./CreateCoursesService"));
function createCourse(req, res) {
    CreateCoursesService_1.default.execute({
        name: "NodeJs",
        educator: "Dani",
        duration: 10
    });
    CreateCoursesService_1.default.execute({
        name: "ReactJs",
        educator: "Diego"
    });
    return res.send();
}
exports.createCourse = createCourse;
