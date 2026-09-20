.class public final Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
.super Lyn;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public X:Ljb9;

.field public Y:Ljava/lang/String;

.field public Z:Landroid/widget/ScrollView;

.field public a0:Landroid/widget/TextView;

.field public b0:I

.field public c0:Lk68;

.field public d0:Ls47;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyn;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Y:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Z:Landroid/widget/ScrollView;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->b0:I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Leq2;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget-boolean p1, Lqi8;->a:Z

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0}, Ly12;->b(Lyn;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1, v0}, Lo55;->s(Landroid/view/Window;Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const p1, 0x7f0c0032

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lyn;->setContentView(I)V

    .line 24
    .line 25
    .line 26
    const p1, 0x7f090116

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lyn;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/widget/TextView;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 36
    .line 37
    const v1, 0x7f1101d7

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lk68;->m(Landroid/content/Context;)Lk68;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->c0:Lk68;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v1, "license"

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljb9;

    .line 64
    .line 65
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->X:Ljb9;

    .line 66
    .line 67
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v1, 0x4

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v2, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->X:Ljb9;

    .line 79
    .line 80
    iget-object v2, v2, Ljb9;->w:Ljava/lang/String;

    .line 81
    .line 82
    iget-object p1, p1, Lu98;->e:Lsk1;

    .line 83
    .line 84
    check-cast p1, Lsj7;

    .line 85
    .line 86
    iput-boolean v0, p1, Lsj7;->g:Z

    .line 87
    .line 88
    iget-object v3, p1, Lsj7;->a:Landroidx/appcompat/widget/Toolbar;

    .line 89
    .line 90
    iput-object v2, p1, Lsj7;->h:Ljava/lang/CharSequence;

    .line 91
    .line 92
    iget v4, p1, Lsj7;->b:I

    .line 93
    .line 94
    and-int/lit8 v4, v4, 0x8

    .line 95
    .line 96
    if-eqz v4, :cond_1

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    iget-boolean p1, p1, Lsj7;->g:Z

    .line 102
    .line 103
    if-eqz p1, :cond_1

    .line 104
    .line 105
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1, v2}, Le58;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object p1, p1, Lu98;->e:Lsk1;

    .line 120
    .line 121
    check-cast p1, Lsj7;

    .line 122
    .line 123
    iget v2, p1, Lsj7;->b:I

    .line 124
    .line 125
    and-int/lit8 v2, v2, -0x3

    .line 126
    .line 127
    const/4 v3, 0x2

    .line 128
    or-int/2addr v2, v3

    .line 129
    invoke-virtual {p1, v2}, Lsj7;->a(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v2, p1, Lu98;->e:Lsk1;

    .line 140
    .line 141
    check-cast v2, Lsj7;

    .line 142
    .line 143
    iget v3, v2, Lsj7;->b:I

    .line 144
    .line 145
    iput-boolean v0, p1, Lu98;->h:Z

    .line 146
    .line 147
    and-int/lit8 p1, v3, -0x5

    .line 148
    .line 149
    or-int/2addr p1, v1

    .line 150
    invoke-virtual {v2, p1}, Lsj7;->a(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p1, p1, Lu98;->e:Lsk1;

    .line 158
    .line 159
    check-cast p1, Lsj7;

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    iput-object v0, p1, Lsj7;->e:Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    invoke-virtual {p1}, Lsj7;->c()V

    .line 165
    .line 166
    .line 167
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->c0:Lk68;

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p1, v0}, Lk68;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {p0, p1}, Lk68;->q(Landroid/content/Context;Ljava/lang/String;)Ls47;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->d0:Ls47;

    .line 182
    .line 183
    iget-object v0, p1, Ls47;->a:Landroid/content/res/Resources;

    .line 184
    .line 185
    iget-object p1, p1, Ls47;->b:Ljava/lang/String;

    .line 186
    .line 187
    const-string v2, "license_activity_scrollview"

    .line 188
    .line 189
    const-string v3, "id"

    .line 190
    .line 191
    invoke-virtual {v0, v2, v3, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    invoke-virtual {p0, p1}, Lyn;->findViewById(I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Landroid/widget/ScrollView;

    .line 200
    .line 201
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Z:Landroid/widget/ScrollView;

    .line 202
    .line 203
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->d0:Ls47;

    .line 204
    .line 205
    iget-object v0, p1, Ls47;->a:Landroid/content/res/Resources;

    .line 206
    .line 207
    iget-object p1, p1, Ls47;->b:Ljava/lang/String;

    .line 208
    .line 209
    const-string v2, "license_activity_textview"

    .line 210
    .line 211
    invoke-virtual {v0, v2, v3, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-virtual {p0, p1}, Lyn;->findViewById(I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Landroid/widget/TextView;

    .line 220
    .line 221
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 222
    .line 223
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->c0:Lk68;

    .line 224
    .line 225
    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->X:Ljb9;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    :try_start_0
    iget-object p1, p1, Lk68;->x:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Lyf3;

    .line 233
    .line 234
    new-instance v2, Lxg8;

    .line 235
    .line 236
    invoke-direct {v2, p1, v0}, Lxg8;-><init>(Lyf3;Ljb9;)V

    .line 237
    .line 238
    .line 239
    const/4 v0, 0x0

    .line 240
    invoke-virtual {p1, v0, v2}, Lkw2;->b(ILi93;)Lyb9;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    new-instance v0, Ly99;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object p1, v0, Ly99;->D:Lyb9;

    .line 250
    .line 251
    sget-object v2, Lvw8;->w:Lvw8;

    .line 252
    .line 253
    new-instance v3, Ln49;

    .line 254
    .line 255
    invoke-direct {v3, v1, v0}, Ln49;-><init>(ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, v2, v3}, Lyb9;->c(Ljava/util/concurrent/Executor;Ly45;)V

    .line 259
    .line 260
    .line 261
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 262
    .line 263
    const-wide/16 v1, 0x2

    .line 264
    .line 265
    invoke-virtual {v0, v1, v2, p1}, Ly99;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :catch_0
    move-exception p1

    .line 273
    goto :goto_1

    .line 274
    :catch_1
    move-exception p1

    .line 275
    goto :goto_1

    .line 276
    :catch_2
    move-exception p1

    .line 277
    :goto_1
    const-string v0, "OssLicenses"

    .line 278
    .line 279
    const-string v1, "Failed to get license detail from OssLicensesClient"

    .line 280
    .line 281
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 282
    .line 283
    .line 284
    const-string p1, ""

    .line 285
    .line 286
    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Y:Ljava/lang/String;

    .line 287
    .line 288
    if-eqz p1, :cond_3

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-eqz p1, :cond_4

    .line 295
    .line 296
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->X:Ljb9;

    .line 297
    .line 298
    iget-wide v0, p1, Ljb9;->x:J

    .line 299
    .line 300
    iget p1, p1, Ljb9;->y:I

    .line 301
    .line 302
    const-string v2, "third_party_licenses"

    .line 303
    .line 304
    invoke-static {p0, v2, v0, v1, p1}, Lz65;->Z(Landroid/content/Context;Ljava/lang/String;JI)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Y:Ljava/lang/String;

    .line 309
    .line 310
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Y:Ljava/lang/String;

    .line 311
    .line 312
    if-nez p1, :cond_5

    .line 313
    .line 314
    const p1, 0x7f1101cc

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Y:Ljava/lang/String;

    .line 322
    .line 323
    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 324
    .line 325
    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Y:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    iget p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->b0:I

    .line 331
    .line 332
    if-nez p1, :cond_6

    .line 333
    .line 334
    return-void

    .line 335
    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Z:Landroid/widget/ScrollView;

    .line 336
    .line 337
    new-instance v0, Lge;

    .line 338
    .line 339
    const/16 v1, 0x18

    .line 340
    .line 341
    invoke-direct {v0, v1, p0}, Lge;-><init>(ILjava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 345
    .line 346
    .line 347
    return-void
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

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x102002c

    .line 6
    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
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

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "scroll_pos"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->b0:I

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
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lrv0;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Z:Landroid/widget/ScrollView;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->Z:Landroid/widget/ScrollView;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object p0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->a0:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineStart(I)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const-string v0, "scroll_pos"

    .line 38
    .line 39
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
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
.end method
