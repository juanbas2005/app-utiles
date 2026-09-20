.class public final Lne1;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic A:I

.field public B:I

.field public final synthetic C:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lf61;I)V
    .locals 0

    .line 1
    iput p3, p0, Lne1;->A:I

    .line 2
    .line 3
    iput-object p1, p0, Lne1;->C:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final l(Lf61;)Lf61;
    .locals 2

    .line 1
    iget v0, p0, Lne1;->A:I

    .line 2
    .line 3
    iget-object p0, p0, Lne1;->C:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lne1;

    .line 9
    .line 10
    check-cast p0, Lek7;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lne1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lne1;

    .line 18
    .line 19
    check-cast p0, Lze7;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lne1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Lne1;

    .line 27
    .line 28
    check-cast p0, Lv6;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, p0, p1, v1}, Lne1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, Lne1;

    .line 36
    .line 37
    check-cast p0, Lwr6;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, p1, v1}, Lne1;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lne1;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Lne1;->C:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lp81;->w:Lp81;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lne1;->B:I

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v6

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    check-cast v2, Lek7;

    .line 35
    .line 36
    iput v5, p0, Lne1;->B:I

    .line 37
    .line 38
    new-instance p1, Lkk0;

    .line 39
    .line 40
    invoke-static {p0}, Lrc9;->a0(Lf61;)Lf61;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {p1, v5, p0}, Lkk0;-><init>(ILf61;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lkk0;->v()V

    .line 48
    .line 49
    .line 50
    iget-object p0, v2, Lek7;->b:Ldq4;

    .line 51
    .line 52
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    iget-object p0, p0, Ldq4;->y:Led5;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Led5;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v2, Lek7;->c:Lkk0;

    .line 60
    .line 61
    invoke-virtual {p1}, Lkk0;->t()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v4, :cond_2

    .line 66
    .line 67
    move-object v1, v4

    .line 68
    :cond_2
    :goto_0
    return-object v1

    .line 69
    :pswitch_0
    check-cast v2, Lze7;

    .line 70
    .line 71
    iget v0, p0, Lne1;->B:I

    .line 72
    .line 73
    const/4 v7, 0x2

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    if-eq v0, v5, :cond_4

    .line 77
    .line 78
    if-ne v0, v7, :cond_3

    .line 79
    .line 80
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_3
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    move-object v1, v6

    .line 88
    goto :goto_7

    .line 89
    :cond_4
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput v5, p0, Lne1;->B:I

    .line 97
    .line 98
    invoke-virtual {v2, p0}, Lze7;->s(Lh61;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v4, :cond_6

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_6
    :goto_1
    invoke-static {v2}, Lze7;->a(Lze7;)Lyb5;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_a

    .line 110
    .line 111
    iget-object v0, p1, Lyb5;->w:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v13, v0

    .line 114
    check-cast v13, Ljava/lang/String;

    .line 115
    .line 116
    iget-object p1, p1, Lyb5;->x:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Llg7;

    .line 119
    .line 120
    iget-wide v9, p1, Llg7;->a:J

    .line 121
    .line 122
    iget-object v12, v2, Lze7;->j:Lwj5;

    .line 123
    .line 124
    if-eqz v12, :cond_a

    .line 125
    .line 126
    iput v7, p0, Lne1;->B:I

    .line 127
    .line 128
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-static {v9, v10}, Llg7;->c(J)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    :goto_2
    move-object p0, v1

    .line 142
    goto :goto_3

    .line 143
    :cond_8
    new-instance v8, Lq0;

    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    invoke-direct/range {v8 .. v13}, Lq0;-><init>(JLf61;Lwj5;Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, v12, Lwj5;->a:Le81;

    .line 150
    .line 151
    new-instance v0, Lng;

    .line 152
    .line 153
    const/16 v3, 0xd

    .line 154
    .line 155
    invoke-direct {v0, v12, v8, v6, v3}, Lng;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {p1, v0, p0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    :goto_3
    if-ne p0, v4, :cond_9

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    move-object p0, v1

    .line 166
    :goto_4
    if-ne p0, v4, :cond_a

    .line 167
    .line 168
    :goto_5
    move-object v1, v4

    .line 169
    goto :goto_7

    .line 170
    :cond_a
    :goto_6
    iput-boolean v5, v2, Lze7;->B:Z

    .line 171
    .line 172
    :goto_7
    return-object v1

    .line 173
    :pswitch_1
    iget v0, p0, Lne1;->B:I

    .line 174
    .line 175
    if-eqz v0, :cond_c

    .line 176
    .line 177
    if-ne v0, v5, :cond_b

    .line 178
    .line 179
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_b
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    move-object p1, v6

    .line 187
    goto :goto_8

    .line 188
    :cond_c
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    check-cast v2, Lv6;

    .line 192
    .line 193
    iput v5, p0, Lne1;->B:I

    .line 194
    .line 195
    invoke-virtual {v2, p0}, Lv6;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-ne p1, v4, :cond_d

    .line 200
    .line 201
    move-object p1, v4

    .line 202
    :cond_d
    :goto_8
    return-object p1

    .line 203
    :pswitch_2
    iget v0, p0, Lne1;->B:I

    .line 204
    .line 205
    if-eqz v0, :cond_f

    .line 206
    .line 207
    if-ne v0, v5, :cond_e

    .line 208
    .line 209
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_c

    .line 213
    :cond_e
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :goto_9
    move-object v1, v6

    .line 217
    goto :goto_c

    .line 218
    :cond_f
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    check-cast v2, Lwr6;

    .line 222
    .line 223
    iput v5, p0, Lne1;->B:I

    .line 224
    .line 225
    iget-object p0, v2, Lwr6;->e:Lz97;

    .line 226
    .line 227
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    check-cast p0, Landroid/content/SharedPreferences;

    .line 232
    .line 233
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    iget-object p1, v2, Lwr6;->f:Ljava/util/Set;

    .line 238
    .line 239
    if-nez p1, :cond_10

    .line 240
    .line 241
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 242
    .line 243
    .line 244
    goto :goto_b

    .line 245
    :cond_10
    move-object v0, p1

    .line 246
    check-cast v0, Ljava/lang/Iterable;

    .line 247
    .line 248
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_11

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    check-cast v3, Ljava/lang/String;

    .line 263
    .line 264
    invoke-interface {p0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 265
    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_11
    :goto_b
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    if-eqz p0, :cond_14

    .line 273
    .line 274
    iget-object p0, v2, Lwr6;->e:Lz97;

    .line 275
    .line 276
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    check-cast p0, Landroid/content/SharedPreferences;

    .line 281
    .line 282
    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_12

    .line 291
    .line 292
    iget-object p0, v2, Lwr6;->c:Landroid/content/Context;

    .line 293
    .line 294
    if-eqz p0, :cond_12

    .line 295
    .line 296
    iget-object v0, v2, Lwr6;->d:Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {p0, v0}, Landroid/content/Context;->deleteSharedPreferences(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    :cond_12
    if-eqz p1, :cond_13

    .line 302
    .line 303
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 304
    .line 305
    .line 306
    :cond_13
    if-ne v1, v4, :cond_15

    .line 307
    .line 308
    move-object v1, v4

    .line 309
    goto :goto_c

    .line 310
    :cond_14
    const-string p0, "Unable to delete migrated keys from SharedPreferences."

    .line 311
    .line 312
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_15
    :goto_c
    return-object v1

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lne1;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    check-cast p1, Lf61;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lne1;->l(Lf61;)Lf61;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lne1;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lne1;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lne1;->l(Lf61;)Lf61;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lne1;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lne1;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    invoke-virtual {p0, p1}, Lne1;->l(Lf61;)Lf61;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lne1;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lne1;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    invoke-virtual {p0, p1}, Lne1;->l(Lf61;)Lf61;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lne1;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lne1;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
