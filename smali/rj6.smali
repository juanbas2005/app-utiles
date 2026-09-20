.class public final Lrj6;
.super Ll66;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:I

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:Ljava/lang/Object;

.field public final synthetic y:I

.field public z:J


# direct methods
.method public constructor <init>(JLg06;Lf61;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lrj6;->y:I

    .line 3
    .line 4
    iput-wide p1, p0, Lrj6;->z:J

    .line 5
    .line 6
    iput-object p3, p0, Lrj6;->C:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Ll66;-><init>(ILf61;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public constructor <init>(Lqk5;Lf61;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrj6;->y:I

    .line 13
    iput-object p1, p0, Lrj6;->C:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ll66;-><init>(ILf61;)V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lrj6;->y:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    check-cast p1, Lg97;

    .line 6
    .line 7
    check-cast p2, Lf61;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lrj6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lrj6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lrj6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lrj6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lrj6;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lrj6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 4

    .line 1
    iget v0, p0, Lrj6;->y:I

    .line 2
    .line 3
    iget-object v1, p0, Lrj6;->C:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lrj6;

    .line 9
    .line 10
    check-cast v1, Lqk5;

    .line 11
    .line 12
    invoke-direct {p0, v1, p1}, Lrj6;-><init>(Lqk5;Lf61;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lrj6;->B:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance v0, Lrj6;

    .line 19
    .line 20
    iget-wide v2, p0, Lrj6;->z:J

    .line 21
    .line 22
    check-cast v1, Lg06;

    .line 23
    .line 24
    invoke-direct {v0, v2, v3, v1, p1}, Lrj6;-><init>(JLg06;Lf61;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v0, Lrj6;->B:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lrj6;->y:I

    .line 2
    .line 3
    iget-object v1, p0, Lrj6;->C:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Lp81;->w:Lp81;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lrj6;->A:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v5, :cond_0

    .line 19
    .line 20
    iget-wide v0, p0, Lrj6;->z:J

    .line 21
    .line 22
    iget-object v2, p0, Lrj6;->B:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lg97;

    .line 25
    .line 26
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lrj6;->B:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lg97;

    .line 40
    .line 41
    check-cast v1, Lqk5;

    .line 42
    .line 43
    iget-wide v0, v1, Lqk5;->b:J

    .line 44
    .line 45
    invoke-virtual {p1}, Lg97;->g()Lg58;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-wide/16 v2, 0x28

    .line 53
    .line 54
    add-long/2addr v2, v0

    .line 55
    move-wide v0, v2

    .line 56
    move-object v2, p1

    .line 57
    :cond_2
    iput-object v2, p0, Lrj6;->B:Ljava/lang/Object;

    .line 58
    .line 59
    iput-wide v0, p0, Lrj6;->z:J

    .line 60
    .line 61
    iput v5, p0, Lrj6;->A:I

    .line 62
    .line 63
    const/4 p1, 0x3

    .line 64
    invoke-static {v2, p0, p1}, Lsb7;->b(Lg97;Lq50;I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v4, :cond_3

    .line 69
    .line 70
    move-object v2, v4

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :goto_0
    check-cast p1, Lqk5;

    .line 73
    .line 74
    iget-wide v6, p1, Lqk5;->b:J

    .line 75
    .line 76
    cmp-long v3, v6, v0

    .line 77
    .line 78
    if-ltz v3, :cond_2

    .line 79
    .line 80
    move-object v2, p1

    .line 81
    :goto_1
    return-object v2

    .line 82
    :pswitch_0
    check-cast v1, Lg06;

    .line 83
    .line 84
    iget v0, p0, Lrj6;->A:I

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    if-ne v0, v5, :cond_4

    .line 89
    .line 90
    iget-object p0, p0, Lrj6;->B:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lg97;

    .line 93
    .line 94
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lrj6;->B:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Lg97;

    .line 108
    .line 109
    iget-wide v2, p0, Lrj6;->z:J

    .line 110
    .line 111
    new-instance v0, Lph6;

    .line 112
    .line 113
    const/4 v6, 0x2

    .line 114
    invoke-direct {v0, v6, v1}, Lph6;-><init>(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Lrj6;->B:Ljava/lang/Object;

    .line 118
    .line 119
    iput v5, p0, Lrj6;->A:I

    .line 120
    .line 121
    invoke-static {p1, v2, v3, v0, p0}, Lmy1;->c(Lg97;JLph6;Lq50;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-ne p0, v4, :cond_6

    .line 126
    .line 127
    move-object v2, v4

    .line 128
    goto :goto_3

    .line 129
    :cond_6
    move-object v8, p1

    .line 130
    move-object p1, p0

    .line 131
    move-object p0, v8

    .line 132
    :goto_2
    check-cast p1, Lqk5;

    .line 133
    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    iget-wide v0, v1, Lg06;->w:J

    .line 137
    .line 138
    const-wide v2, 0x7fffffff7fffffffL

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    and-long/2addr v0, v2

    .line 144
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    cmp-long p1, v0, v2

    .line 150
    .line 151
    if-eqz p1, :cond_7

    .line 152
    .line 153
    sget-object v2, Ljx1;->x:Ljx1;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    iget-object p0, p0, Lg97;->B:Lh97;

    .line 157
    .line 158
    iget-object p0, p0, Lh97;->O:Lkk5;

    .line 159
    .line 160
    iget-object p0, p0, Lkk5;->a:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {p0}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Lqk5;

    .line 167
    .line 168
    invoke-static {p0}, Lub5;->d(Lqk5;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    invoke-virtual {p0}, Lqk5;->a()V

    .line 175
    .line 176
    .line 177
    sget-object v2, Ljx1;->w:Ljx1;

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_8
    sget-object v2, Ljx1;->z:Ljx1;

    .line 181
    .line 182
    :goto_3
    return-object v2

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
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
