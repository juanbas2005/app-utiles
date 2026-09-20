.class public final synthetic Lji;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lji;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lji;->y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p3, p0, Lji;->x:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lji;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, Lji;->x:Z

    .line 5
    .line 6
    iget-object p0, p0, Lji;->y:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La37;

    .line 12
    .line 13
    check-cast p1, Loh4;

    .line 14
    .line 15
    check-cast p2, Lgh4;

    .line 16
    .line 17
    check-cast p3, Lk31;

    .line 18
    .line 19
    iget-wide v0, p3, Lk31;->a:J

    .line 20
    .line 21
    invoke-interface {p2, v0, v1}, Lgh4;->y(J)Leh5;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget p3, p2, Leh5;->w:I

    .line 26
    .line 27
    iget v0, p2, Leh5;->x:I

    .line 28
    .line 29
    new-instance v1, Lpu1;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v1, p0, v2, p2, v3}, Lpu1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lb42;->w:Lb42;

    .line 36
    .line 37
    invoke-interface {p1, p3, v0, p0, v1}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast p0, Lfw0;

    .line 43
    .line 44
    check-cast p1, Lfa6;

    .line 45
    .line 46
    move-object v8, p2

    .line 47
    check-cast v8, Lyt2;

    .line 48
    .line 49
    check-cast p3, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    and-int/lit8 p2, p1, 0x11

    .line 56
    .line 57
    const/16 p3, 0x10

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    if-eq p2, p3, :cond_0

    .line 61
    .line 62
    move p2, v0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move p2, v1

    .line 65
    :goto_0
    and-int/2addr p1, v0

    .line 66
    invoke-virtual {v8, p1, p2}, Lyt2;->V(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, v8, p1}, Lfw0;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget p0, Lyd0;->f:F

    .line 80
    .line 81
    sget-object p1, Ljl4;->w:Ljl4;

    .line 82
    .line 83
    invoke-static {p1, p0}, Lyu6;->l(Lml4;F)Lml4;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {v8, p0}, Lk75;->a(Lyt2;Lml4;)V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lsu0;->q()Lx83;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    const p0, 0x59f760c7

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, p0}, Lyt2;->e0(I)V

    .line 100
    .line 101
    .line 102
    const p0, 0x7f110224

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v8}, Lh75;->i(ILyt2;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {v8, v1}, Lyt2;->r(Z)V

    .line 110
    .line 111
    .line 112
    :goto_1
    move-object v4, p0

    .line 113
    goto :goto_2

    .line 114
    :cond_1
    const p0, 0x59f8d106

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, p0}, Lyt2;->e0(I)V

    .line 118
    .line 119
    .line 120
    const p0, 0x7f110228

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v8}, Lh75;->i(ILyt2;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v8, v1}, Lyt2;->r(Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :goto_2
    if-eqz v2, :cond_2

    .line 132
    .line 133
    const/high16 p0, 0x43340000    # 180.0f

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_2
    const/4 p0, 0x0

    .line 137
    :goto_3
    invoke-static {p1, p0}, Lub5;->r(Lml4;F)Lml4;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    const/4 v9, 0x0

    .line 142
    const/16 v10, 0x8

    .line 143
    .line 144
    const-wide/16 v6, 0x0

    .line 145
    .line 146
    invoke-static/range {v3 .. v10}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_3
    invoke-virtual {v8}, Lyt2;->Y()V

    .line 151
    .line 152
    .line 153
    :goto_4
    sget-object p0, Lvs7;->a:Lvs7;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_1
    check-cast p0, Lsr2;

    .line 157
    .line 158
    check-cast p1, Lml4;

    .line 159
    .line 160
    check-cast p2, Lyt2;

    .line 161
    .line 162
    check-cast p3, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const p3, -0xbba9706

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, p3}, Lyt2;->e0(I)V

    .line 171
    .line 172
    .line 173
    sget-object p3, Log7;->a:Lyy0;

    .line 174
    .line 175
    invoke-virtual {p2, p3}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    check-cast p3, Lng7;

    .line 180
    .line 181
    iget-wide v3, p3, Lng7;->a:J

    .line 182
    .line 183
    invoke-virtual {p2, v3, v4}, Lyt2;->f(J)Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    invoke-virtual {p2, p0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    or-int/2addr p3, v0

    .line 192
    invoke-virtual {p2, v2}, Lyt2;->h(Z)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    or-int/2addr p3, v0

    .line 197
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-nez p3, :cond_4

    .line 202
    .line 203
    sget-object p3, Lay0;->a:Ld63;

    .line 204
    .line 205
    if-ne v0, p3, :cond_5

    .line 206
    .line 207
    :cond_4
    new-instance v0, Lki;

    .line 208
    .line 209
    invoke-direct {v0, v3, v4, p0, v2}, Lki;-><init>(JLsr2;Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, v0}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_5
    check-cast v0, Lvr2;

    .line 216
    .line 217
    invoke-static {p1, v0}, Lpv8;->y(Lml4;Lvr2;)Lml4;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p2, v1}, Lyt2;->r(Z)V

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
