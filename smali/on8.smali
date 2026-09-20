.class public final synthetic Lon8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Los2;


# static fields
.field public static final synthetic A:Lon8;

.field public static final synthetic x:Lon8;

.field public static final synthetic y:Lon8;

.field public static final synthetic z:Lon8;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lon8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lon8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lon8;->x:Lon8;

    .line 8
    .line 9
    new-instance v0, Lon8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lon8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lon8;->y:Lon8;

    .line 16
    .line 17
    new-instance v0, Lon8;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lon8;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lon8;->z:Lon8;

    .line 24
    .line 25
    new-instance v0, Lon8;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lon8;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lon8;->A:Lon8;

    .line 32
    .line 33
    return-void
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
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lon8;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lon8;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzmk;

    .line 7
    .line 8
    iget p0, p1, Lcom/google/android/gms/internal/measurement/zzmk;->w:I

    .line 9
    .line 10
    const/16 v0, 0x734a

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lw69;->w()Lv69;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {}, Lp69;->G()Lo69;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-virtual {p1}, Lll8;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p1, Lll8;->x:Lnl8;

    .line 30
    .line 31
    check-cast v2, Lp69;

    .line 32
    .line 33
    invoke-virtual {v2, v0, v1}, Lp69;->I(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lll8;->b()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lll8;->x:Lnl8;

    .line 40
    .line 41
    check-cast v0, Lw69;

    .line 42
    .line 43
    invoke-virtual {p1}, Lll8;->d()Lnl8;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lp69;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lw69;->x(Lp69;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lll8;->d()Lnl8;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lw69;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_0
    throw p1

    .line 60
    :pswitch_0
    check-cast p1, Lu59;

    .line 61
    .line 62
    invoke-static {}, Lt99;->z()Ls99;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Lll8;->d()Lnl8;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lt99;

    .line 73
    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_1
    invoke-virtual {p1}, Lu59;->x()Lzl8;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_8

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Lx59;

    .line 95
    .line 96
    invoke-static {}, Lv99;->z()Lu99;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1}, Lx59;->t()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2}, Lll8;->b()V

    .line 105
    .line 106
    .line 107
    iget-object v4, v2, Lll8;->x:Lnl8;

    .line 108
    .line 109
    check-cast v4, Lv99;

    .line 110
    .line 111
    invoke-virtual {v4, v3}, Lv99;->A(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Lx59;->H()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    add-int/lit8 v4, v3, -0x1

    .line 119
    .line 120
    const/4 v5, 0x0

    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    const/4 v3, 0x1

    .line 126
    if-eq v4, v3, :cond_5

    .line 127
    .line 128
    const/4 v3, 0x2

    .line 129
    if-eq v4, v3, :cond_4

    .line 130
    .line 131
    const/4 v3, 0x3

    .line 132
    if-eq v4, v3, :cond_3

    .line 133
    .line 134
    const/4 v3, 0x4

    .line 135
    if-ne v4, v3, :cond_2

    .line 136
    .line 137
    invoke-virtual {v1}, Lx59;->y()Lvk8;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v2}, Lll8;->b()V

    .line 142
    .line 143
    .line 144
    iget-object v3, v2, Lll8;->x:Lnl8;

    .line 145
    .line 146
    check-cast v3, Lv99;

    .line 147
    .line 148
    invoke-virtual {v3, v1}, Lv99;->F(Lvk8;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    const-string p0, "No known flag type"

    .line 153
    .line 154
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    move-object p0, v5

    .line 158
    goto/16 :goto_2

    .line 159
    .line 160
    :cond_3
    invoke-virtual {v1}, Lx59;->x()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v2}, Lll8;->b()V

    .line 165
    .line 166
    .line 167
    iget-object v3, v2, Lll8;->x:Lnl8;

    .line 168
    .line 169
    check-cast v3, Lv99;

    .line 170
    .line 171
    invoke-virtual {v3, v1}, Lv99;->E(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_4
    invoke-virtual {v1}, Lx59;->w()D

    .line 176
    .line 177
    .line 178
    move-result-wide v3

    .line 179
    invoke-virtual {v2}, Lll8;->b()V

    .line 180
    .line 181
    .line 182
    iget-object v1, v2, Lll8;->x:Lnl8;

    .line 183
    .line 184
    check-cast v1, Lv99;

    .line 185
    .line 186
    invoke-virtual {v1, v3, v4}, Lv99;->D(D)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    invoke-virtual {v1}, Lx59;->v()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-virtual {v2}, Lll8;->b()V

    .line 195
    .line 196
    .line 197
    iget-object v3, v2, Lll8;->x:Lnl8;

    .line 198
    .line 199
    check-cast v3, Lv99;

    .line 200
    .line 201
    invoke-virtual {v3, v1}, Lv99;->C(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    invoke-virtual {v1}, Lx59;->u()J

    .line 206
    .line 207
    .line 208
    move-result-wide v3

    .line 209
    invoke-virtual {v2}, Lll8;->b()V

    .line 210
    .line 211
    .line 212
    iget-object v1, v2, Lll8;->x:Lnl8;

    .line 213
    .line 214
    check-cast v1, Lv99;

    .line 215
    .line 216
    invoke-virtual {v1, v3, v4}, Lv99;->B(J)V

    .line 217
    .line 218
    .line 219
    :goto_1
    invoke-virtual {v2}, Lll8;->d()Lnl8;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Lv99;

    .line 224
    .line 225
    invoke-virtual {p0}, Lll8;->b()V

    .line 226
    .line 227
    .line 228
    iget-object v2, p0, Lll8;->x:Lnl8;

    .line 229
    .line 230
    check-cast v2, Lt99;

    .line 231
    .line 232
    invoke-virtual {v2, v1}, Lt99;->F(Lv99;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_7
    throw v5

    .line 238
    :cond_8
    invoke-virtual {p1}, Lu59;->w()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {p0}, Lll8;->b()V

    .line 243
    .line 244
    .line 245
    iget-object v1, p0, Lll8;->x:Lnl8;

    .line 246
    .line 247
    check-cast v1, Lt99;

    .line 248
    .line 249
    invoke-virtual {v1, v0}, Lt99;->D(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Lu59;->t()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p0}, Lll8;->b()V

    .line 257
    .line 258
    .line 259
    iget-object v1, p0, Lll8;->x:Lnl8;

    .line 260
    .line 261
    check-cast v1, Lt99;

    .line 262
    .line 263
    invoke-virtual {v1, v0}, Lt99;->B(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Lu59;->y()J

    .line 267
    .line 268
    .line 269
    move-result-wide v0

    .line 270
    invoke-virtual {p0}, Lll8;->b()V

    .line 271
    .line 272
    .line 273
    iget-object v2, p0, Lll8;->x:Lnl8;

    .line 274
    .line 275
    check-cast v2, Lt99;

    .line 276
    .line 277
    invoke-virtual {v2, v0, v1}, Lt99;->E(J)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Lu59;->u()Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_9

    .line 285
    .line 286
    invoke-virtual {p1}, Lu59;->v()Lvk8;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p0}, Lll8;->b()V

    .line 291
    .line 292
    .line 293
    iget-object v0, p0, Lll8;->x:Lnl8;

    .line 294
    .line 295
    check-cast v0, Lt99;

    .line 296
    .line 297
    invoke-virtual {v0, p1}, Lt99;->C(Lvk8;)V

    .line 298
    .line 299
    .line 300
    :cond_9
    invoke-virtual {p0}, Lll8;->d()Lnl8;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    check-cast p0, Lt99;

    .line 305
    .line 306
    :goto_2
    return-object p0

    .line 307
    :pswitch_1
    check-cast p1, Landroid/content/Context;

    .line 308
    .line 309
    sget-object p0, Lw89;->i:Lq11;

    .line 310
    .line 311
    const-string p0, ""

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 315
    .line 316
    sget-object p0, Lpn8;->b:Ljava/lang/String;

    .line 317
    .line 318
    if-nez p0, :cond_b

    .line 319
    .line 320
    const-class v0, Lpn8;

    .line 321
    .line 322
    monitor-enter v0

    .line 323
    :try_start_0
    sget-object p0, Lpn8;->b:Ljava/lang/String;

    .line 324
    .line 325
    if-nez p0, :cond_a

    .line 326
    .line 327
    const-string p0, "com.google.android.gms.measurement"

    .line 328
    .line 329
    invoke-static {p1, p0}, Lu49;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    sput-object p0, Lpn8;->b:Ljava/lang/String;

    .line 334
    .line 335
    goto :goto_3

    .line 336
    :catchall_0
    move-exception p0

    .line 337
    goto :goto_4

    .line 338
    :cond_a
    :goto_3
    monitor-exit v0

    .line 339
    goto :goto_5

    .line 340
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    throw p0

    .line 342
    :cond_b
    :goto_5
    return-object p0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
