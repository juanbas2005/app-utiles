.class public final Ld31;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lqi2;


# direct methods
.method public synthetic constructor <init>(Lqi2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld31;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Ld31;->x:Lqi2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final a(Lfi2;Lf61;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ld31;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Ld31;->x:Lqi2;

    .line 6
    .line 7
    sget-object v3, Lp81;->w:Lp81;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    instance-of v0, p2, Lwd4;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, p2

    .line 17
    check-cast v0, Lwd4;

    .line 18
    .line 19
    iget v4, v0, Lwd4;->A:I

    .line 20
    .line 21
    const/high16 v5, -0x80000000

    .line 22
    .line 23
    and-int v6, v4, v5

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    sub-int/2addr v4, v5

    .line 28
    iput v4, v0, Lwd4;->A:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lwd4;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, Lwd4;-><init>(Ld31;Lf61;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, Lwd4;->z:Ljava/lang/Object;

    .line 37
    .line 38
    iget p2, v0, Lwd4;->A:I

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    if-ne p2, v4, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, Lb6;

    .line 60
    .line 61
    const/16 p2, 0xa

    .line 62
    .line 63
    invoke-direct {p0, p1, p2}, Lb6;-><init>(Lfi2;I)V

    .line 64
    .line 65
    .line 66
    iput v4, v0, Lwd4;->A:I

    .line 67
    .line 68
    invoke-virtual {v2, p0, v0}, Lqi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v3, :cond_3

    .line 73
    .line 74
    move-object v1, v3

    .line 75
    :cond_3
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    new-instance p0, Lb6;

    .line 77
    .line 78
    const/4 v0, 0x5

    .line 79
    invoke-direct {p0, p1, v0}, Lb6;-><init>(Lfi2;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p0, p2}, Lqi2;->a(Lfi2;Lf61;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v3, :cond_4

    .line 87
    .line 88
    move-object v1, p0

    .line 89
    :cond_4
    return-object v1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
