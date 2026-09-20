.class public final Lx82;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Lx82;

.field public static final c:Lx82;


# instance fields
.field public final a:Lnm7;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lx82;

    .line 2
    .line 3
    new-instance v1, Lnm7;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/16 v7, 0x7f

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lx82;-><init>(Lnm7;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lx82;->b:Lx82;

    .line 19
    .line 20
    new-instance v0, Lx82;

    .line 21
    .line 22
    new-instance v1, Lnm7;

    .line 23
    .line 24
    const/16 v7, 0x5f

    .line 25
    .line 26
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lx82;-><init>(Lnm7;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lx82;->c:Lx82;

    .line 33
    .line 34
    return-void
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

.method public constructor <init>(Lnm7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx82;->a:Lnm7;

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
.method public final a(Lx82;)Lx82;
    .locals 8

    .line 1
    new-instance v0, Lx82;

    .line 2
    .line 3
    new-instance v1, Lnm7;

    .line 4
    .line 5
    iget-object p1, p1, Lx82;->a:Lnm7;

    .line 6
    .line 7
    iget-object v2, p1, Lnm7;->a:Lgb2;

    .line 8
    .line 9
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lnm7;->a:Lgb2;

    .line 14
    .line 15
    :cond_0
    iget-object v3, p1, Lnm7;->b:Ldv6;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-object v3, p0, Lnm7;->b:Ldv6;

    .line 20
    .line 21
    :cond_1
    iget-object v4, p1, Lnm7;->c:Lcn0;

    .line 22
    .line 23
    if-nez v4, :cond_2

    .line 24
    .line 25
    iget-object v4, p0, Lnm7;->c:Lcn0;

    .line 26
    .line 27
    :cond_2
    iget-object v5, p1, Lnm7;->d:Lxf6;

    .line 28
    .line 29
    if-nez v5, :cond_3

    .line 30
    .line 31
    iget-object v5, p0, Lnm7;->d:Lxf6;

    .line 32
    .line 33
    :cond_3
    iget-boolean v6, p1, Lnm7;->e:Z

    .line 34
    .line 35
    if-nez v6, :cond_5

    .line 36
    .line 37
    iget-boolean v6, p0, Lnm7;->e:Z

    .line 38
    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    const/4 v6, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_5
    :goto_0
    const/4 v6, 0x1

    .line 45
    :goto_1
    iget-object p0, p0, Lnm7;->f:Ljava/util/Map;

    .line 46
    .line 47
    iget-object p1, p1, Lnm7;->f:Ljava/util/Map;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lsf4;->X(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;ZLjava/util/Map;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1}, Lx82;-><init>(Lnm7;)V

    .line 57
    .line 58
    .line 59
    return-object v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lx82;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lx82;

    .line 6
    .line 7
    iget-object p1, p1, Lx82;->a:Lnm7;

    .line 8
    .line 9
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lnm7;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnm7;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lx82;->b:Lx82;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lx82;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "ExitTransition.None"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Lx82;->c:Lx82;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lx82;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "ExitTransition.KeepUntilTransitionsFinished"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 24
    .line 25
    iget-object v0, p0, Lnm7;->a:Lgb2;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lgb2;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object v0, v1

    .line 36
    :goto_0
    iget-object v2, p0, Lnm7;->b:Ldv6;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v2}, Ldv6;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move-object v2, v1

    .line 46
    :goto_1
    iget-object v3, p0, Lnm7;->c:Lcn0;

    .line 47
    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    invoke-virtual {v3}, Lcn0;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    move-object v3, v1

    .line 56
    :goto_2
    iget-object v4, p0, Lnm7;->d:Lxf6;

    .line 57
    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    invoke-virtual {v4}, Lxf6;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :cond_5
    iget-boolean p0, p0, Lnm7;->e:Z

    .line 65
    .line 66
    const-string v4, ",\nSlide - "

    .line 67
    .line 68
    const-string v5, ",\nShrink - "

    .line 69
    .line 70
    const-string v6, "ExitTransition: \nFade - "

    .line 71
    .line 72
    invoke-static {v6, v0, v4, v2, v5}, Lf21;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, ",\nScale - "

    .line 77
    .line 78
    const-string v4, ",\nKeepUntilTransitionsFinished - "

    .line 79
    .line 80
    invoke-static {v0, v3, v2, v1, v4}, Lf21;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
    .line 91
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
