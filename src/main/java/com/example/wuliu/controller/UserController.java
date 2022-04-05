package com.example.wuliu.controller;

import com.example.wuliu.entity.User;
import com.example.wuliu.service.UserService;
import com.example.wuliu.util.JwtUtils;
import com.example.wuliu.util.R;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-03-27 15:41:57
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R queryById(@PathVariable("id") Integer id) {
        return R.ok().setData(this.userService.queryById(id));
    }

    /*
     * @Author yym
     * @Description //TODO 校验用户是否登录
     * @Date  2022/4/5 11:05
     * @Param [token]
     */
    @GetMapping("/verify")
    public ResponseEntity<Boolean> verify(@RequestParam("token") String token) {

        token = token.substring(7, token.length());
        if (StringUtils.isBlank(token)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
        }
        return ResponseEntity.ok(JwtUtils.verfy(token));
    }

    /*
     * @Author yym
     * @Description //TODO 登录
     * @Date  2022/3/27 16:29
     * @Param [username, password]
     */
    @PostMapping("/login")
    public ResponseEntity<String> adminLogin(@RequestBody User user, HttpServletRequest request,
                                             HttpServletResponse response) {
        String token = this.userService.adminLogin(user.getUsername(), user.getPassword());
//        System.out.print(token);
        if (StringUtils.isBlank(token)) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return ResponseEntity.ok("Bearer:" + token);
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}

