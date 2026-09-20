.class public final Lr63;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public A:I

.field public B:I

.field public synthetic C:Lyg5;

.field public synthetic D:Ljava/lang/Object;

.field public final synthetic E:Lt63;

.field public final synthetic F:Lj43;


# direct methods
.method public constructor <init>(Lt63;Lj43;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr63;->E:Lt63;

    .line 2
    .line 3
    iput-object p2, p0, Lr63;->F:Lj43;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, La97;-><init>(ILf61;)V

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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lr63;->C:Lyg5;

    .line 2
    .line 3
    iget-object v1, p0, Lr63;->D:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lr63;->B:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    sget-object v6, Lp81;->w:Lp81;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v5

    .line 29
    :cond_1
    iget v1, p0, Lr63;->A:I

    .line 30
    .line 31
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    instance-of p1, v1, Lj85;

    .line 40
    .line 41
    if-eqz p1, :cond_8

    .line 42
    .line 43
    iget-object p1, v0, Lyg5;->w:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v2, p1

    .line 46
    check-cast v2, Ly53;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iput-object v1, v2, Ly53;->d:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ly53;->b(Lfp7;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, Ly53;

    .line 57
    .line 58
    iget-object v1, p1, Ly53;->f:Liz0;

    .line 59
    .line 60
    sget-object v2, Lf63;->a:Lau;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Liz0;->d(Lau;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/Integer;

    .line 67
    .line 68
    const/16 v2, 0x14

    .line 69
    .line 70
    iget-object v7, p0, Lr63;->E:Lt63;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    if-lt v8, v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    const v8, 0x7fffffff

    .line 88
    .line 89
    .line 90
    if-ge v2, v8, :cond_3

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v1, v4

    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    goto :goto_0

    .line 103
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move v1, v2

    .line 107
    :goto_0
    new-instance v2, Lp63;

    .line 108
    .line 109
    iget-object v8, p0, Lr63;->F:Lj43;

    .line 110
    .line 111
    invoke-direct {v2, v1, v8}, Lp63;-><init>(ILj43;)V

    .line 112
    .line 113
    .line 114
    iget-object v7, v7, Lt63;->a:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-static {v7}, Ldt0;->O0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Lhs2;

    .line 135
    .line 136
    new-instance v9, Lq63;

    .line 137
    .line 138
    invoke-direct {v9, v8, v2}, Lq63;-><init>(Lhs2;Lyk6;)V

    .line 139
    .line 140
    .line 141
    move-object v2, v9

    .line 142
    goto :goto_1

    .line 143
    :cond_5
    iput-object v0, p0, Lr63;->C:Lyg5;

    .line 144
    .line 145
    iput-object v5, p0, Lr63;->D:Ljava/lang/Object;

    .line 146
    .line 147
    iput v1, p0, Lr63;->A:I

    .line 148
    .line 149
    iput v4, p0, Lr63;->B:I

    .line 150
    .line 151
    invoke-interface {v2, p1, p0}, Lyk6;->a(Ly53;Lh61;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-ne p1, v6, :cond_6

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    :goto_2
    check-cast p1, Ll43;

    .line 159
    .line 160
    iput-object v5, p0, Lr63;->C:Lyg5;

    .line 161
    .line 162
    iput-object v5, p0, Lr63;->D:Ljava/lang/Object;

    .line 163
    .line 164
    iput v1, p0, Lr63;->A:I

    .line 165
    .line 166
    iput v3, p0, Lr63;->B:I

    .line 167
    .line 168
    invoke-virtual {v0, p0, p1}, Lyg5;->d(Lf61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-ne p0, v6, :cond_7

    .line 173
    .line 174
    :goto_3
    return-object v6

    .line 175
    :cond_7
    :goto_4
    sget-object p0, Lvs7;->a:Lvs7;

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string p1, "\n|Fail to prepare request body for sending. \n|The body type is: "

    .line 181
    .line 182
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    sget-object v1, Lb26;->a:Lc26;

    .line 190
    .line 191
    invoke-virtual {v1, p1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string p1, ", with Content-Type: "

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    iget-object p1, v0, Lyg5;->w:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Lh53;

    .line 206
    .line 207
    invoke-static {p1}, Lpv8;->p(Lh53;)Lq51;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string p1, ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."

    .line 215
    .line 216
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {p0}, Le57;->g0(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, Lku4;->g(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-object v5
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lyg5;

    .line 2
    .line 3
    check-cast p3, Lf61;

    .line 4
    .line 5
    new-instance v0, Lr63;

    .line 6
    .line 7
    iget-object v1, p0, Lr63;->E:Lt63;

    .line 8
    .line 9
    iget-object p0, p0, Lr63;->F:Lj43;

    .line 10
    .line 11
    invoke-direct {v0, v1, p0, p3}, Lr63;-><init>(Lt63;Lj43;Lf61;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lr63;->C:Lyg5;

    .line 15
    .line 16
    iput-object p2, v0, Lr63;->D:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object p0, Lvs7;->a:Lvs7;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lr63;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
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
